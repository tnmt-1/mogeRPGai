package moge.rpg.ai.vo;

import java.util.Map;

public class MonsterVo implements Comparable<MonsterVo> {

    public MonsterVo(Map<String, Object> monsterData) {
        this.name = (String) monsterData.get("name");
        this.number = (int) monsterData.get("number");
        this.level = (int) monsterData.get("level");
        this.hp = (int) monsterData.get("hp");
    }

    private String name;
    private int number;
    private int level;
    private int hp;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public int compareTo(MonsterVo o) {
        int leveldiff = this.level - o.getLevel();
        if (leveldiff == 0) {
            int hpdiff = this.hp - o.getHp();
            return hpdiff;
        }
        return leveldiff;
    }
}