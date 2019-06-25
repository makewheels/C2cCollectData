package mission.okex;

import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OkexDao {
    public static void save(Okex huobi) {
        String sql = "insert into okex(coinName,json,type,sessionId,url,provider,timestamp,platform)" +
                " values (?,?,?,?,?,?,?,?)";
        Connection connection = JdbcUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, huobi.getCoinName());
            preparedStatement.setString(2, huobi.getJson());
            preparedStatement.setString(3, huobi.getType());
            preparedStatement.setString(4, huobi.getSessionId());
            preparedStatement.setString(5, huobi.getUrl());
            preparedStatement.setString(6, huobi.getProvider());
            preparedStatement.setTimestamp(7, huobi.getTimestamp());
            preparedStatement.setString(8, huobi.getPlatform());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
