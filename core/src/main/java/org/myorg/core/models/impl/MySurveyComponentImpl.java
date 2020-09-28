package org.myorg.core.models.impl;

import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.myorg.core.models.MySurveyComponent;

@Model(adaptables = SlingHttpServletRequest.class, adapters = { MySurveyComponent.class, ComponentExporter.class }, 
    resourceType = MySurveyComponentImpl.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class MySurveyComponentImpl implements MySurveyComponent {

    static final String RESOURCE_TYPE = "csurvey/components/my-survey";

    @ValueMapValue
    private String question;

    @ValueMapValue
    private String opt1;

    @ValueMapValue
    private String opt2;

    @Override
    public String getQuestion() {
        return StringUtils.isNotBlank(question) ? question.toUpperCase() : "";
    }

    @Override
    public String getOpt1() {
        return StringUtils.isNotBlank(opt1) ? opt1.toUpperCase() : "";
    }

    @Override
    public String getOpt2() {
        return StringUtils.isNotBlank(opt2) ? opt2.toUpperCase() : "";
    }

	@Override
	public String getExportedType() {
		// TODO Auto-generated method stub
		return MySurveyComponentImpl.RESOURCE_TYPE;
	}

}