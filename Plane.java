/*
 * This is an Airplane class.
 *
 * @author  Roman Cernetchi
 * @version 1.0
 * @since   2021-12-28
 */

/** This is the Airplane class. */
public class Plane {
    /** The speed of the airplane. */
    private int speed;

    /** Initialization. */
    public Plane() {
        this.speed = 0;
    }

    /**
     * Getter for speed.
     *
     * @return speed
     * */
    public int getSpeed() {
        return speed;
    }

    /**
     * Setter for speed.
     *
     * @param newSpeed new speed
     * */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }
}

