package start;

import mission.HuobiMission;
import util.UuidUtil;

public class Run {
    public static void main(String[] args) {
        String sessionId = UuidUtil.getUuid();
        HuobiMission.run(sessionId);

    }
}
