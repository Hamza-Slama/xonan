package net.vpc.app.vainruling.plugins.forum.service.model;

import net.vpc.upa.config.Entity;
import net.vpc.upa.config.Id;
import net.vpc.upa.config.Path;
import net.vpc.upa.config.Sequence;

@Entity
@Path("/Inspections")
public class QuestionInspection {
    @Id @Sequence
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
