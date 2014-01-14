package com.gol;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {
	Cell cell;
	
	@Before
	public void setUp() throws Exception {
		cell = new Cell();
	}

	@Test
	public void aliveCellIsAlive() {
		cell.alive = true;
		assertTrue(cell.isAlive());
	}
	@Test
	public void defaultCellStartingStateIsDead(){
		assertFalse(cell.isAlive());
	}
	@Test
	public void setNeighborCountSetsNumberOfNeighbors() {
		cell.setNeighborCount(2);
		assertEquals(2, cell.neighbors);
	}
	@Test
	public void aliveCellWithZeroNeighborsDies(){
		cell.alive=true;
		cell.setNeighborCount(0);
		assertFalse(cell.isAlive());
	}
	@Test
	public void aliveCellWithOneNeighborDies() {
		cell.alive = true;
		cell.setNeighborCount(1);
		assertFalse(cell.isAlive());
	}
	@Test
	public void aliveCellWithTwoNeighborsSurvives(){
		cell.alive = true;
		cell.setNeighborCount(2);
		assertTrue(cell.isAlive());
	}
	@Test
	public void aliveCellWithThreeNeighborsSurvives() {
		cell.alive = true;
		cell.setNeighborCount(3);
		assertTrue(cell.isAlive());
	}
	@Test
	public void aliveCellWithFourNeighborsIsOverpopulated() {
		cell.alive=true;
		cell.setNeighborCount(4);
		assertFalse(cell.isAlive());
	}
	@Test
	public void deadCellComesAliveWithThreeNeighbors() {
		cell.alive = false;
		cell.setNeighborCount(3);
		assertTrue(cell.isAlive());
	}
	@Test
	public void deadCellWithOneNeighborStaysDead() {
		cell.alive = false;
		cell.setNeighborCount(1);
		assertFalse(cell.isAlive());
	}
	@Test
	public void deadCellWithTwoNeighborsStaysDead() {
		cell.alive = false;
		cell.setNeighborCount(2);
		assertFalse(cell.isAlive());
		}
	@Test
	public void deadCellWithFourNeighborsStaysDead() {
		cell.alive=false;
		cell.setNeighborCount(4);
		assertFalse(cell.isAlive());
	}
}
