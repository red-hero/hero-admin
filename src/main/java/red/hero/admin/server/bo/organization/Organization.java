package red.hero.admin.server.bo.organization;

import red.hero.admin.server.framework.jpa.AbstractEntity;

/**
 * Created by mst on 21.06.16.
 */
public class Organization extends AbstractEntity {

    String name;

    public Organization() {

    }

    public Organization(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
