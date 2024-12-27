package com.example;

import com.example.ApprovalModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("approval")
@io.quarkus.runtime.Startup()
public class ApprovalProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.ApprovalModel> {

    public ApprovalProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.CreditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler());
    }

    @jakarta.inject.Inject()
    public ApprovalProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.CreditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler creditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler) {
        super(app, java.util.Arrays.asList(creditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler), correlations);
        activate();
    }

    public ApprovalProcess() {
    }

    @Override()
    public com.example.ApprovalProcessInstance createInstance(com.example.ApprovalModel value) {
        return new com.example.ApprovalProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.ApprovalProcessInstance createInstance(java.lang.String businessKey, com.example.ApprovalModel value) {
        return new com.example.ApprovalProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.ApprovalProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.ApprovalModel value) {
        return new com.example.ApprovalProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.ApprovalModel createModel() {
        return new com.example.ApprovalModel();
    }

    public com.example.ApprovalProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.ApprovalModel) value);
    }

    public com.example.ApprovalProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.ApprovalModel) value);
    }

    public com.example.ApprovalProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ApprovalProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.ApprovalProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ApprovalProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("approval", true);
        factory.variable("approval", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("customTags", "output", "approval", "approval", "ItemSubjectRef", "_approvalItem"));
        factory.variable("applicant", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Applicant.class), java.util.Map.of("customTags", "input", "ItemSubjectRef", "_applicantItem", "applicant", "applicant"));
        factory.variable("creditCard", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.CreditCard.class), java.util.Map.of("customTags", "output", "creditCard", "creditCard", "ItemSubjectRef", "_creditCardItem"));
        factory.name("approval");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_6BBD4095_A2B3_41D4_AE02_C12148D65E75 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6BBD4095-A2B3-41D4-AE02-C12148D65E75"));
        endNode_6BBD4095_A2B3_41D4_AE02_C12148D65E75.name("End");
        endNode_6BBD4095_A2B3_41D4_AE02_C12148D65E75.terminate(false);
        endNode_6BBD4095_A2B3_41D4_AE02_C12148D65E75.metaData("UniqueId", "_6BBD4095-A2B3-41D4-AE02-C12148D65E75");
        endNode_6BBD4095_A2B3_41D4_AE02_C12148D65E75.metaData("x", 1655);
        endNode_6BBD4095_A2B3_41D4_AE02_C12148D65E75.metaData("width", 56);
        endNode_6BBD4095_A2B3_41D4_AE02_C12148D65E75.metaData("y", 461);
        endNode_6BBD4095_A2B3_41D4_AE02_C12148D65E75.metaData("height", 56);
        endNode_6BBD4095_A2B3_41D4_AE02_C12148D65E75.done();
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode_091906AC_C013_4CE7_9D43_1F85EEA0E780 = factory.joinNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_091906AC-C013-4CE7-9D43-1F85EEA0E780"));
        joinNode_091906AC_C013_4CE7_9D43_1F85EEA0E780.name("Join");
        joinNode_091906AC_C013_4CE7_9D43_1F85EEA0E780.type(2);
        joinNode_091906AC_C013_4CE7_9D43_1F85EEA0E780.metaData("UniqueId", "_091906AC-C013-4CE7-9D43-1F85EEA0E780");
        joinNode_091906AC_C013_4CE7_9D43_1F85EEA0E780.metaData("x", 1255);
        joinNode_091906AC_C013_4CE7_9D43_1F85EEA0E780.metaData("width", 56);
        joinNode_091906AC_C013_4CE7_9D43_1F85EEA0E780.metaData("y", 189);
        joinNode_091906AC_C013_4CE7_9D43_1F85EEA0E780.metaData("height", 56);
        joinNode_091906AC_C013_4CE7_9D43_1F85EEA0E780.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1B358012-BEE8-48E1-8618-C7A5A07E141C"));
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.name("Split");
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.type(2);
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.metaData("UniqueId", "_1B358012-BEE8-48E1-8618-C7A5A07E141C");
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.metaData("x", 1255);
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.metaData("width", 56);
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.metaData("y", 460);
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.metaData("Default", "_B3CAF3CC-7CF8-4A6E-8631-3B28F1D1230D");
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.metaData("height", 56);
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_091906AC-C013-4CE7-9D43-1F85EEA0E780"), "_6C7298EE-4A73-4CE6-813A-40EFA7F2853F", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String approval = (java.lang.String) kcontext.getVariable("approval");
            return approval.toLowerCase().equals("approved");
        }, 0, false);
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6BBD4095-A2B3-41D4-AE02-C12148D65E75"), "_B3CAF3CC-7CF8-4A6E-8631-3B28F1D1230D", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String approval = (java.lang.String) kcontext.getVariable("approval");
            return approval.toLowerCase().equals("rejected");
        }, 0, true);
        splitNode_1B358012_BEE8_48E1_8618_C7A5A07E141C.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_136481F4-8785-4EF1-9BEA-65E525118299"));
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.name("Review Application");
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.workParameter("ActorId", "jdoe");
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.workParameter("NodeName", "Review Application");
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.workParameter("Skippable", "false");
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.workParameter("TaskName", "Task");
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_136481F4-8785-4EF1-9BEA-65E525118299_TaskNameInputX", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("4c9020d4-bedb-4588-860d-d061a01bb465", "EXPRESSION (Task)", "java.lang.Object", "Task"), new org.jbpm.workflow.core.impl.DataDefinition("_136481F4-8785-4EF1-9BEA-65E525118299_TaskNameInputX", "TaskName", "Object", null))), null));
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("applicant", "applicant", "org.acme.cc_approval.model.Applicant", null)), new org.jbpm.workflow.core.impl.DataDefinition("_136481F4-8785-4EF1-9BEA-65E525118299_applicantInputX", "applicant", "org.acme.cc_approval.model.Applicant", null), null, null));
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_136481F4-8785-4EF1-9BEA-65E525118299_SkippableInputX", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("9ae442b8-3b25-41d0-bf99-b37ec77dd3a9", "EXPRESSION (false)", "java.lang.Object", "false"), new org.jbpm.workflow.core.impl.DataDefinition("_136481F4-8785-4EF1-9BEA-65E525118299_SkippableInputX", "Skippable", "Object", null))), null));
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.done();
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.metaData("UniqueId", "_136481F4-8785-4EF1-9BEA-65E525118299");
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.metaData("elementname", "Review Application");
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.metaData("x", 933);
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.metaData("width", 154);
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.metaData("y", 444);
        humanTaskNode_136481F4_8785_4EF1_9BEA_65E525118299.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_CD7CFF95_8D92_4F42_A794_04399EDE0CE0 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CD7CFF95-8D92-4F42-A794-04399EDE0CE0"));
        endNode_CD7CFF95_8D92_4F42_A794_04399EDE0CE0.name("End");
        endNode_CD7CFF95_8D92_4F42_A794_04399EDE0CE0.terminate(false);
        endNode_CD7CFF95_8D92_4F42_A794_04399EDE0CE0.metaData("UniqueId", "_CD7CFF95-8D92-4F42-A794-04399EDE0CE0");
        endNode_CD7CFF95_8D92_4F42_A794_04399EDE0CE0.metaData("x", 902);
        endNode_CD7CFF95_8D92_4F42_A794_04399EDE0CE0.metaData("width", 56);
        endNode_CD7CFF95_8D92_4F42_A794_04399EDE0CE0.metaData("y", 653);
        endNode_CD7CFF95_8D92_4F42_A794_04399EDE0CE0.metaData("height", 56);
        endNode_CD7CFF95_8D92_4F42_A794_04399EDE0CE0.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_C2482C78_5643_4A50_B124_66C736288F25 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C2482C78-5643-4A50-B124-66C736288F25"));
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.name("Split");
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.type(2);
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.metaData("UniqueId", "_C2482C78-5643-4A50-B124-66C736288F25");
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.metaData("x", 765);
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.metaData("width", 56);
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.metaData("y", 467);
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.metaData("Default", "_9A47DC27-D2DE-42FA-A24F-77A44094D3FA");
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.metaData("height", 56);
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_136481F4-8785-4EF1-9BEA-65E525118299"), "_9A47DC27-D2DE-42FA-A24F-77A44094D3FA", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String approval = (java.lang.String) kcontext.getVariable("approval");
            return approval.toLowerCase().equals("manual");
        }, 0, true);
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CD7CFF95-8D92-4F42-A794-04399EDE0CE0"), "_6CE29E93-66F0-4BCC-BB8D-542FEA441582", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String approval = (java.lang.String) kcontext.getVariable("approval");
            return approval.toLowerCase().equals("rejected");
        }, 0, false);
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_091906AC-C013-4CE7-9D43-1F85EEA0E780"), "_51AA3A41-4FDE-417E-88F0-9004507060A6", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String approval = (java.lang.String) kcontext.getVariable("approval");
            return approval.toLowerCase().equals("approved");
        }, 0, false);
        splitNode_C2482C78_5643_4A50_B124_66C736288F25.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C = factory.ruleSetNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CD629077-F96D-4F05-9E10-8D3618A65A0C"));
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.name("Is Eligible");
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.decision("https://kie.org/dmn/_639D6115-E08E-439D-8D29-45750C32DB28", "Credit Card Eligibility Validation", "IsEligible", () -> {
            return app.get(org.kie.kogito.decision.DecisionModels.class).getDecisionModel("https://kie.org/dmn/_639D6115-E08E-439D-8D29-45750C32DB28", "Credit Card Eligibility Validation");
        });
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_CD629077-F96D-4F05-9E10-8D3618A65A0C_fileNameInputX", "fileName", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("d906d17a-0386-4b45-8a67-921b19dced59", "EXPRESSION (CreditCardEligibility.dmn)", "java.lang.Object", "CreditCardEligibility.dmn"), new org.jbpm.workflow.core.impl.DataDefinition("_CD629077-F96D-4F05-9E10-8D3618A65A0C_fileNameInputX", "fileName", "java.lang.String", null))), null));
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_CD629077-F96D-4F05-9E10-8D3618A65A0C_namespaceInputX", "namespace", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("f455b547-0113-4b3f-a744-4b472c7897cd", "EXPRESSION (https://kie.org/dmn/_639D6115-E08E-439D-8D29-45750C32DB28)", "java.lang.Object", "https://kie.org/dmn/_639D6115-E08E-439D-8D29-45750C32DB28"), new org.jbpm.workflow.core.impl.DataDefinition("_CD629077-F96D-4F05-9E10-8D3618A65A0C_namespaceInputX", "namespace", "java.lang.String", null))), null));
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_CD629077-F96D-4F05-9E10-8D3618A65A0C_decisionInputX", "decision", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("b963037c-6861-4387-a719-dff239b5448d", "EXPRESSION (IsEligible)", "java.lang.Object", "IsEligible"), new org.jbpm.workflow.core.impl.DataDefinition("_CD629077-F96D-4F05-9E10-8D3618A65A0C_decisionInputX", "decision", "java.lang.String", null))), null));
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_CD629077-F96D-4F05-9E10-8D3618A65A0C_modelInputX", "model", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("ca2c384a-8e5b-4740-b452-df47eef6eed2", "EXPRESSION (Credit Card Eligibility Validation)", "java.lang.Object", "Credit Card Eligibility Validation"), new org.jbpm.workflow.core.impl.DataDefinition("_CD629077-F96D-4F05-9E10-8D3618A65A0C_modelInputX", "model", "java.lang.String", null))), null));
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("applicant", "applicant", "org.acme.cc_approval.model.Applicant", null)), new org.jbpm.workflow.core.impl.DataDefinition("_CD629077-F96D-4F05-9E10-8D3618A65A0C_ApplicantInputX", "Applicant", "org.acme.cc_approval.model.Applicant", null), null, null));
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.metaData("UniqueId", "_CD629077-F96D-4F05-9E10-8D3618A65A0C");
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.metaData("elementname", "Is Eligible");
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.metaData("x", 550);
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.metaData("width", 154);
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.metaData("y", 444);
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.metaData("height", 102);
        ruleSetNode_CD629077_F96D_4F05_9E10_8D3618A65A0C.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_48806F31-5F4F-4914-89E8-14E620A3F7C7"));
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.name("Approved");
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.terminate(false);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("UniqueId", "_48806F31-5F4F-4914-89E8-14E620A3F7C7");
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("elementname", "Approved");
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("x", 1655);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("width", 56);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("y", 189);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("height", 56);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09 = factory.workItemNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09"));
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.name("Generate CC Details");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workName("org.acme.cc_approval.service.CreditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("Interface", "org.acme.cc_approval.service.CreditCardService");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("NodeName", "Generate CC Details");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("Operation", "generateCreditCardDetails");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("implementation", "Java");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("interfaceImplementationRef", "org.acme.cc_approval.service.CreditCardService");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("operationImplementationRef", "generateCreditCardDetails");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("applicant", "applicant", "org.acme.cc_approval.model.Applicant", null)), new org.jbpm.workflow.core.impl.DataDefinition("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09_applicantInputX", "applicant", "org.acme.cc_approval.model.Applicant", null), null, null));
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09_creditCardOutputX", "creditCard", "org.acme.cc_approval.model.CreditCard", null)), new org.jbpm.workflow.core.impl.DataDefinition("creditCard", "creditCard", "org.acme.cc_approval.model.CreditCard", null), null, null));
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.done();
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("UniqueId", "_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("Implementation", "Java");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("elementname", "Generate CC Details");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("Type", "Service Task");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("OperationRef", "_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09_ServiceOperation");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("x", 1381);
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("width", 154);
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("y", 166);
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E"));
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.name("Log application received");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("UniqueId", "_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("elementname", "Log application received");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("NodeType", "ScriptTask");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("x", 317);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("width", 154);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("y", 444);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("height", 102);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.action(kcontext -> {
            org.acme.cc_approval.model.Applicant applicant = (org.acme.cc_approval.model.Applicant) kcontext.getVariable("applicant");
            System.out.println("Process started for: " + applicant);
        });
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_85AB1CEB-8F7A-4E62-B652-BABEE236ADD8"));
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.name("Start");
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.interrupting(true);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("UniqueId", "_85AB1CEB-8F7A-4E62-B652-BABEE236ADD8");
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("x", 210);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("width", 56);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("y", 467);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("height", 56);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1B358012-BEE8-48E1-8618-C7A5A07E141C"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6BBD4095-A2B3-41D4-AE02-C12148D65E75"), "_B3CAF3CC-7CF8-4A6E-8631-3B28F1D1230D");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1B358012-BEE8-48E1-8618-C7A5A07E141C"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_091906AC-C013-4CE7-9D43-1F85EEA0E780"), "_6C7298EE-4A73-4CE6-813A-40EFA7F2853F");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C2482C78-5643-4A50-B124-66C736288F25"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_091906AC-C013-4CE7-9D43-1F85EEA0E780"), "_51AA3A41-4FDE-417E-88F0-9004507060A6");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_136481F4-8785-4EF1-9BEA-65E525118299"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1B358012-BEE8-48E1-8618-C7A5A07E141C"), "_26B16130-7E94-4DB5-A4FB-2027DB4E42FC");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C2482C78-5643-4A50-B124-66C736288F25"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_136481F4-8785-4EF1-9BEA-65E525118299"), "_9A47DC27-D2DE-42FA-A24F-77A44094D3FA");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C2482C78-5643-4A50-B124-66C736288F25"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CD7CFF95-8D92-4F42-A794-04399EDE0CE0"), "_6CE29E93-66F0-4BCC-BB8D-542FEA441582");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CD629077-F96D-4F05-9E10-8D3618A65A0C"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C2482C78-5643-4A50-B124-66C736288F25"), "_FF61B345-9962-4470-A7FA-AC90444B240E");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CD629077-F96D-4F05-9E10-8D3618A65A0C"), "_8C6EB85E-8897-4A68-BC2F-70C95A3B03E7");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_48806F31-5F4F-4914-89E8-14E620A3F7C7"), "_B44ECAC8-5066-4417-97B0-ED30DC2033E1");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_091906AC-C013-4CE7-9D43-1F85EEA0E780"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09"), "_88DC4173-836C-4BFC-ABAA-A288AA1E4A51");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_85AB1CEB-8F7A-4E62-B652-BABEE236ADD8"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E"), "_9B9122D7-42A7-47A9-9A86-A8347025F166");
        factory.validate();
        return factory.getProcess();
    }
}
