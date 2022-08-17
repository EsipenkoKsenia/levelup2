package ru.levelup;

public class Animals {

    private String login;
    private String name;
    private int age;
    private int bonus;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString(){
        return "\nLogin=" + getLogin() + "::Имя=" + getName() + "::Возраст=" + getAge() + "::Бонусы=" + getBonus();
    }

}
