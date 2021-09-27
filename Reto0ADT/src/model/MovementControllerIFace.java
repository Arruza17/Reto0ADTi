package model;

/**
 *
 * @author Yeray
 */
public interface MovementControllerIFace {

    //MOVEMENT
    /**
     * Method used in order to insert them into the DB It receives a movement
     * filled with data
     *
     * @param mov
     */
    public void makeMovement(Movement mov);

}
