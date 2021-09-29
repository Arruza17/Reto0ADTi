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

    private final String MAKEMOVEMENT = "INSERT INTO movement values(default,?,?,?,?,?)";
    private final BDConnection DAO = new BDConnection();

    /**
     * @param mov Gets a movement and puts it into the DB
     * @throws java.lang.Exception
     */
    @Override
    public void makeMovement(Movement mov) throws Exception {
        try {
            Connection con = DAO.openConnection();
            PreparedStatement stmt;
            stmt = con.prepareStatement(MAKEMOVEMENT);
            stmt.setDouble(1, mov.getAmount());
            stmt.setDouble(2, mov.getBalance());
            stmt.setString(3, mov.getDescription());
            stmt.setTimestamp(4, Timestamp.valueOf(mov.getTimestamp()));
            stmt.setLong(5, mov.getAccId());

            stmt.executeUpdate();
            stmt.close();
            DAO.closeConnection(stmt, con);
        } catch (SQLException ex) {
            throw ex;

        }

    }

}
