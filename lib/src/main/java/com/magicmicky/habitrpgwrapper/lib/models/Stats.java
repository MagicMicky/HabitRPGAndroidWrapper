package com.magicmicky.habitrpgwrapper.lib.models;

/**
 * Created by MagicMicky on 16/03/14.
 */
public class Stats extends BasicStats{
    private BasicStats training;//stats.training
    private Buffs buffs;//stats.buffs
    private int points, lvl;
    private HabitRpgClass _class;
    private Double gp, exp, mp, hp;
    private int toNextLevel;//xp needed to be earned
    private int maxHealth, maxMP;


    public BasicStats getTraining() {
        return training;
    }

    public void setTraining(BasicStats training) {
        this.training = training;
    }

    public Buffs getBuffs() {
        return buffs;
    }

    public void setBuffs(Buffs buffs) {
        this.buffs = buffs;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public HabitRpgClass get_class() {
        return _class;
    }

    public void set_class(HabitRpgClass _class) {
        this._class = _class;
    }

    public Double getGp() {
        return gp;
    }

    public void setGp(Double gp) {
        this.gp = gp;
    }

    public Double getExp() {
        return exp;
    }

    public void setExp(Double exp) {
        this.exp = exp;
    }

    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public int getToNextLevel() {
        return toNextLevel;
    }

    public void setToNextLevel(int toNextLevel) {
        this.toNextLevel = toNextLevel;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    private class Buffs extends BasicStats {
        private boolean snowball;
        private boolean streaks;
        private Buffs() {
            this(false,false);
        }
        private Buffs(boolean snowball, boolean streaks) {
            this.snowball = snowball;
            this.streaks = streaks;
        }

        public boolean getSnowball() {
            return snowball;
        }

        public void setSnowball(boolean snowball) {
            this.snowball = snowball;
        }

        public boolean getStreaks() {
            return streaks;
        }

        public void setStreaks(boolean streaks) {
            this.streaks = streaks;
        }
    }

}
