package pl.jitakulab.calculatorcnc;

public interface CalculatorContract {

    //Our View handles these methods
    interface PublishToView{
        void showResult(String result);

        void showToastMessage(String message);
    }

    //passes click events from our View (CalcStandardFragment), to the presenter
    interface ForwardInputAndDisplayInteractionToPresenter {
        void onDeleteClick();

        void onUndoClick();

        void onNumberClick(int number);

        void onDecimalClick();

        void onEvaluateClick();

        void onOperatorClick(String operator);

    }

}
