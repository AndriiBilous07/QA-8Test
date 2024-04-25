package lesson10;

import java.util.Objects;
import java.util.Set;

public class Family  {
    private Human father;
    private Human mother;
    private Set <Human> children;

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Set<Human> getChildren() {
        return children;
    }

    public void setChildren(Set<Human> children) {
        this.children = children;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(father, family.father) && Objects.equals(mother, family.mother)
                && Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother, children);
    }

    public void addChild(Human child) {
        children.add(child);
        child.setFather(father);
        child.setMother(mother);
    }

    public boolean deleteChild(Human child) {
        return children.remove(child);
    }

    public int countFamily() {
        return 2 + children.size();
    }
}
