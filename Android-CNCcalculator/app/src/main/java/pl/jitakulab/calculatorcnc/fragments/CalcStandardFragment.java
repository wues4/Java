package pl.jitakulab.calculatorcnc.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pl.jitakulab.calculatorcnc.CalculatorContract;
import pl.jitakulab.calculatorcnc.R;

public class CalcStandardFragment extends Fragment implements CalculatorContract.PublishToView {

    private CalculatorContract.ForwardInputAndDisplayInteractionToPresenter forwardInteraction;

    @BindView(R.id.tv_display)
    TextView display;

    public CalcStandardFragment() {
    }

    public static CalcStandardFragment newInstance() {
        return new CalcStandardFragment();
    }

    public void setPresenter(CalculatorContract.ForwardInputAndDisplayInteractionToPresenter forwardInteraction){
        this.forwardInteraction = forwardInteraction;
    }

    @OnClick({R.id.btn_number_zero, R.id.btn_number_one, R.id.btn_number_two, R.id.btn_number_three, R.id.btn_number_four,
            R.id.btn_number_five, R.id.btn_number_six, R.id.btn_number_seven, R.id.btn_number_eight, R.id.btn_number_nine})
    public void onNumberClick(Button v) {
        forwardInteraction.onNumberClick(Integer.parseInt(v.getText().toString()));
    }

    @OnClick({R.id.btn_operator_add, R.id.btn_operator_divide, R.id.btn_operator_multiply, R.id.btn_operator_subtract,
            R.id.btn_operator_percentage, R.id.btn_operator_plus_minus})
    public void onOperatorClick(Button v) {
        forwardInteraction.onOperatorClick(v.getText().toString());
    }

    @OnClick(R.id.btn_operator_undo)
    public void onUndoClick(Button v) {
        forwardInteraction.onUndoClick();
    }

    @OnClick(R.id.btn_operator_clear)
    public void onDeleteClick(Button v) {
        forwardInteraction.onDeleteClick();
    }

    @OnClick(R.id.btn_decimal)
    public void onDecimalClick(Button v) {
        forwardInteraction.onDecimalClick();
    }

    @OnClick(R.id.btn_evaluate)
    public void onEvaluateClick(Button v) {
        forwardInteraction.onEvaluateClick();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_standard_calc, container, false);
        ButterKnife.bind(this, v);

        return v;
    }

    @Override
    public void showResult(String result) {

    }

    @Override
    public void showToastMessage(String message) {

    }
}