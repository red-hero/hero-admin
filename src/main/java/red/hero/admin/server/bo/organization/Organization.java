package red.hero.admin.server.bo.organization;

import red.hero.admin.server.framework.jpa.AbstractEntity;

/**
 * Representing an Organization responsible managing Members.
 */
public class Organization extends AbstractEntity {

    private String name;

    public Organization() {

    }

    public Organization(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
