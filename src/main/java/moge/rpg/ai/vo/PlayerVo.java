package moge.rpg.ai.vo;

import java.util.List;
import java.util.Map;

public class PlayerVo {
    @SuppressWarnings("unchecked")
    public PlayerVo(Map<String, Object> playerData) {
        this.hp = (int) playerData.get("hp");
        this.maxhp = (int) playerData.get("maxhp");
        this.str = (int) playerData.get("str");
        this.agi = (int) playerData.get("agi");
        this.maxagi = (int) playerData.get("maxagi");
        this.level = (int) playerData.get("level");
        this.exp = (int) playerData.get("exp");
        this.heal = (int) playerData.get("heal");
        this.mapLevel = (int) playerData.get("map-level");
        this.buki = (List<String>) playerData.get("buki");
        Map<String, Object> pos = (Map<String, Object>) playerData.get("pos");
        this.posX = (int) pos.get("x");
        this.posY = (int) pos.get("y");
    }

    private int hp;
    private int maxhp;
    private int str;
    private int maxstr;
    private int agi;
    private int maxagi;
    private int level;
    private int exp;
    private int heal;
    private int hammer;
    private int mapLevel;
    private List<String> buki;
    private int posX;
    private int posY;

    public int getHp() {
        return hp;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public int getStr() {
        return str;
    }

    public int getMaxstr() {
        return maxstr;
    }

    public int getAgi() {
        return agi;
    }

    public int getMaxagi() {
        return maxagi;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public int getHeal() {
        return heal;
    }

    public int getHammer() {
        return hammer;
    }

    public int getMapLevel() {
        return mapLevel;
    }

    public List<String> getBuki() {
        return buki;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public boolean needHeal() {
        double hpPercent = (double) hp / (double) maxhp;
        return hpPercent <= 0.3 && heal > 0;
    }

}