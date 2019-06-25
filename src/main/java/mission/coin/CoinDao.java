package mission.coin;

import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CoinDao {
    public static void save(Coin coin) {
        String sql = "insert into coin(json,platform,sessionId,url,provider,timestamp,coinName)" +
                " values (?,?,?,?,?,?,?)";
        Connection connection = JdbcUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, coin.getJson());
            preparedStatement.setString(2, coin.getPlatform());
            preparedStatement.setString(3, coin.getSessionId());
            preparedStatement.setString(4, coin.getUrl());
            preparedStatement.setString(5, coin.getProvider());
            preparedStatement.setTimestamp(6, coin.getTimestamp());
            preparedStatement.setString(7,coin.getCoinName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
