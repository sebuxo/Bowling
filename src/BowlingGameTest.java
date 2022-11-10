import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private BowlingGame g;

	void rollMany(int n, int pins, BowlingGame g) {
		for (int i = 0; i < n; i++) g.roll(pins);
	}

	@Before
	public void setUp() {
		this.g = new BowlingGame();
	}

	@Test
	public void testZero() {
		rollMany(20, 0, g);
		assertEquals(0, g.score());
	}
	

	@Test
	public void testSpare() {
		g.roll(7);
		g.roll(3);
		g.roll(3);
		rollMany(17, 0, g);
		assertEquals(16, g.score());
	}
	
	@Test
	public void testStrike() {
		g.roll(10);
		g.roll(1);
		g.roll(6);
		rollMany(16, 0, g);
		assertEquals(24, g.score());
	}
	
	@Test
	public void testPerfectGame() {
		rollMany(12, 10, g);
		assertEquals(300, g.score());
	}
}