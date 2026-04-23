package koschei.models;

public class Island2 {

    private Wood3 wood;

    // Этот конструктор будет вызван в AppConfig.getIsland()
    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}