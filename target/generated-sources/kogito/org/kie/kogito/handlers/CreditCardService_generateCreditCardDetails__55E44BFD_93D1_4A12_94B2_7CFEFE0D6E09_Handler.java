package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@jakarta.enterprise.context.ApplicationScoped()
public class CreditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.cc_approval.service.CreditCardService service;

    public CreditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler() {
        this(new org.acme.cc_approval.service.CreditCardService());
    }

    @jakarta.inject.Inject()
    public CreditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler(org.acme.cc_approval.service.CreditCardService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.generateCreditCardDetails((org.acme.cc_approval.model.Applicant) workItem.getParameter("applicant"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("creditCard", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.cc_approval.service.CreditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler";
    }
}
