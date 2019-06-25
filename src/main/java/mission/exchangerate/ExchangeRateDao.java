package mission.exchangerate;

import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExchangeRateDao {
    public static void save(ExchangeRate exchangeRate) {
        String sql = "insert into exchange_rate(json,platform,sessionId,url,provider,timestamp)" +
                " values (?,?,?,?,?,?)";
        Connection connection = JdbcUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, exchangeRate.getJson());
            preparedStatement.setString(2, exchangeRate.getPlatform());
            preparedStatement.setString(3, exchangeRate.getSessionId());
            preparedStatement.setString(4, exchangeRate.getUrl());
            preparedStatement.setString(5, exchangeRate.getProvider());
            preparedStatement.setTimestamp(6, exchangeRate.getTimestamp());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
