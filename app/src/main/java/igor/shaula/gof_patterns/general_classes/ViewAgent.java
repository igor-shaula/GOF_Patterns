package igor.shaula.gof_patterns.general_classes;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import igor.shaula.gof_patterns.R;

/**
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public class ViewAgent implements View.OnClickListener {

    private TextView tvResult;

    private EditText etNewData;

    private Caller mCaller;

    // implemented by calling activity \
    public interface Caller {
        void receiveNew(int value);
    }

    public ViewAgent(Caller caller, View rootView) {

        mCaller = caller;

        tvResult = (TextView) rootView.findViewById(R.id.tvResult);
        etNewData = (EditText) rootView.findViewById(R.id.etNewData);
        Button bTestObserver = (Button) rootView.findViewById(R.id.bTestObserver);

        bTestObserver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Editable newData = etNewData.getText();

        int value = 0;
        try {
            value = Integer.valueOf(String.valueOf(newData));
        } catch (NumberFormatException nfe) {
            //noinspection ConstantConditions
            if (value > 0) {
                value = Integer.MAX_VALUE;
            } else {
                value = Integer.MIN_VALUE;
            }
        }
        mCaller.receiveNew(value);
    }

    public void updateText(CharSequence newText) {
        tvResult.setText(newText);
    }
}