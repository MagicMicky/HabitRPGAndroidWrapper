package com.magicmicky.habitrpgwrapper.lib.models;

/**
 * Created by MagicMicky on 16/03/14.
 */
public class Stats {
    private BasicStats training;//stats.training
    private BasicStats basicStats;//stats.
    private Buffs buffs;//stats.buffs
    private int points, lvl;
    private HabitRpgClass _class;
    private Double gp, exp, mp, hp;
    private int toNextLevel;//xp needed to be earned
    private int maxHealth, maxMP;

    public Stats() {
        this(null,null,null, 0,0,null,0.0,0.0,0.0,0.0,0,0,0);
    }

    public Stats(BasicStats training, BasicStats basicStats, Buffs buffs, int points, int lvl, HabitRpgClass _class, Double gp, Double exp, Double mp, Double hp, int toNextLevel, int maxHealth, int maxMP) {
        this.training = training;
        this.basicStats = basicStats;
        this.buffs = buffs;
        this.points = points;
        this.lvl = lvl;
        this._class = _class;
        this.gp = gp;
        this.exp = exp;
        this.mp = mp;
        this.hp = hp;
        this.toNextLevel = toNextLevel;
        this.maxHealth = maxHealth;
        this.maxMP = maxMP;
    }

    public BasicStats getTraining() {
        return training;
    }

    public void setTraining(BasicStats training) {
        this.training = training;
    }

    public BasicStats getBasicStats() {
        return basicStats;
    }

    public void setBasicStats(BasicStats basicStats) {
        this.basicStats = basicStats;
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

    private class BasicStats {
        private int con, str, per, _int;

        private BasicStats() {
            this(0,0,0,0);
        }
        private BasicStats(int con, int str, int per, int _int) {
            this.con = con;
            this.str = str;
            this.per = per;
            this._int = _int;
        }

        public int getCon() {
            return con;
        }

        public void setCon(int con) {
            this.con = con;
        }

        public int getStr() {
            return str;
        }

        public void setStr(int str) {
            this.str = str;
        }

        public int getPer() {
            return per;
        }

        public void setPer(int per) {
            this.per = per;
        }

        public int get_int() {
            return _int;
        }

        public void set_int(int _int) {
            this._int = _int;
        }
    }
    private class Buffs extends BasicStats {
        private int snowball;
        private int streaks;
        private Buffs() {
            this(0,0);
        }
        private Buffs(int snowball, int streaks) {
            super();
            this.snowball = snowball;
            this.streaks = streaks;
        }

        public int getSnowball() {
            return snowball;
        }

        public void setSnowball(int snowball) {
            this.snowball = snowball;
        }

        public int getStreaks() {
            return streaks;
        }

        public void setStreaks(int streaks) {
            this.streaks = streaks;
        }
    }

}
