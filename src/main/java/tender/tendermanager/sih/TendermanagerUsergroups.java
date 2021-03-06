package tender.tendermanager.sih;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the tendermanager-usergroups template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("tendermanager-usergroups")
@JsModule("./tendermanager-usergroups.js")
public class TendermanagerUsergroups extends PolymerTemplate<TendermanagerUsergroups.TendermanagerUsergroupsModel> {

    /**
     * Creates a new TendermanagerUsergroups.
     */
    public TendermanagerUsergroups() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between TendermanagerUsergroups and tendermanager-usergroups
     */
    public interface TendermanagerUsergroupsModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
