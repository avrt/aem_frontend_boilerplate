package org.myorg.core.models;
import com.adobe.cq.export.json.ComponentExporter;

public interface MySurveyComponent extends ComponentExporter {

    public String getQuestion();
    public String getOpt1();
    public String getOpt2();

}