package start;

import mission.coin.CoinMission;
import mission.exchangerate.ExchangeRateMission;
import mission.huobi.HuobiMission;
import util.UuidUtil;

public class Run {
    public static void main(String[] args) {
        String sessionId = UuidUtil.getUuid();
        HuobiMission.run(sessionId);
        ExchangeRateMission.run(sessionId);
        CoinMission.run(sessionId);
    }
}
