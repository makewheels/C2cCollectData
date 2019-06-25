package start;

import mission.coin.CoinMission;
import mission.exchangerate.ExchangeRateMission;
import mission.huobi.HuobiMission;
import mission.okex.OkexMission;
import util.ProxyUtil;
import util.UuidUtil;

public class Run {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            ProxyUtil.setProxy();
        }
        String sessionId = UuidUtil.getUuid();
        HuobiMission.run(sessionId);
        ExchangeRateMission.run(sessionId);
        CoinMission.run(sessionId);
        OkexMission.run(sessionId);
    }
}
