/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danis
 */
public class ReportCommand implements Command {
    private final Repository repository;
    private final String outputPath;

    public ReportCommand(Repository repository, String outputPath) {
        this.repository = repository;
        this.outputPath = outputPath;
    }

    @Override
    public void execute() throws IOException, TemplateException {
        if (outputPath == null) {
            throw new IllegalArgumentException("Output path cannot be null.");
        }

        Configuration configuration = new Configuration(Configuration.VERSION_2_3_31);
        configuration.setClassForTemplateLoading(ReportCommand.class, "/");
        Template template = configuration.getTemplate("C:\\Users\\hritc\\OneDrive\\Documents\\GitHub\\Pa_A2_2024\\lab5\\src\\report_template.ftl");

        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("repository", repository);

        try (FileWriter writer = new FileWriter(new File(outputPath))) {
            template.process(dataModel, writer);
        }

        System.out.println("HTML report generated: " + outputPath);
    }
}