package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author Yeray
 */
public class MovementControllerImplementationMysql implements MovementControllerIFace {

    private final String MAKEMOVEMENT = "INSERT INTO movement values(?,?,?,?,?)";
    private final BDConnection DAO = new BDConnection();

    /**
     * @param mov Gets a movement and puts it into the DB
     */
    @Override
    public void makeMovement(Movement mov) {
        try {
            Connection con = DAO.openConnection();
            PreparedStatement stmt;
            stmt = con.prepareStatement(MAKEMOVEMENT);
            stmt.setLong(1, mov.getId());
            stmt.setTimestamp(2, Timestamp.valueOf(mov.getTimestamp()));
            stmt.setDouble(3, mov.getAmount());
            stmt.setDouble(4, mov.getBalance());
            stmt.setString(5, mov.getDescription());
            stmt.executeUpdate();
            stmt.close();
            DAO.closeConnection(stmt, con);
        } catch (SQLException ex) {
            System.out.println("ERROR");

        }

    }

}
