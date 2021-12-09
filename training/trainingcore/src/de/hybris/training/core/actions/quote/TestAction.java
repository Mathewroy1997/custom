package de.hybris.training.core.actions.quote;

import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.task.RetryLaterException;
import de.hybris.training.core.model.TestProcessesModel;
import org.apache.log4j.Logger;

public class TestAction extends AbstractSimpleDecisionAction<TestProcessesModel> {

    private static final Logger LOG = Logger.getLogger(TestAction.class);

    @Override
    public Transition executeAction(TestProcessesModel testProcessesModel) throws RetryLaterException, Exception {
        LOG.info("Tested!!!");
        return Transition.OK;
    }
}