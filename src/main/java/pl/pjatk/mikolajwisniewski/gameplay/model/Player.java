package pl.pjatk.mikolajwisniewski.gameplay.model;

public class Player {

    private int id;
    private int hp;
    private int atk;
    private String name;

    public Player() {

    }

    public Player(int id, int hp, int atk, String name) {
        this.id = id;
        this.hp = hp;
        this.atk = atk;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
