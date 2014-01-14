/**
 * Paragraph of useless stuff!
 * 
 * @someParameter
 * 
 */
package com.gol;

public class Cell {

	public boolean alive;
	public int neighbors;

	public boolean isAlive() {
		return alive;
	}

	public void setNeighborCount(int i) {
		neighbors = i;
		updateAliveness();
	}
	
	private void updateAliveness() {
		if (neighbors < 2 || neighbors > 3) {
			alive = false;
		} else if (neighbors == 3) {
			alive=true;			
		}
	}

}
