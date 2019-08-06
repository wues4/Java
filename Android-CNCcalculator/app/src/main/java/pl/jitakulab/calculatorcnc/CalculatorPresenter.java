package pl.jitakulab.calculatorcnc;


public class CalculatorPresenter implements CalculatorContract.ForwardInputAndDisplayInteractionToPresenter {

    private CalculatorContract.PublishToView publishResult;

    //An object of CalcStandardFragment
    public CalculatorPresenter(CalculatorContract.PublishToView publishResult){
        this.publishResult = publishResult;
    }

    @Override
    public void onDeleteClick() {

    }

    @Override
    public void onUndoClick() {

    }

    @Override
    public void onNumberClick(int number) {

    }

    @Override
    public void onDecimalClick() {

    }

    @Override
    public void onEvaluateClick() {

    }

    @Override
    public void onOperatorClick(String operator) {

    }
}
