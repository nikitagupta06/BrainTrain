package trainedge.qaapp.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import trainedge.qaapp.Model.QuesModel;
import trainedge.qaapp.R;


public class QuesFragment extends Fragment {

    public TextView tv_question;
    RadioButton rb_option1, rb_option2, rb_option3, rb_option4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ques, container, false);


        tv_question = (TextView) view.findViewById(R.id.tv_question);
        rb_option1 = (RadioButton) view.findViewById(R.id.rb_option1);
        rb_option2 = (RadioButton) view.findViewById(R.id.rb_option2);
        rb_option3 = (RadioButton) view.findViewById(R.id.rb_option3);
        rb_option4 = (RadioButton) view.findViewById(R.id.rb_option4);

        return view;
    }

    public void setupData(QuesModel model) {
        tv_question.setText(model.getQues());
        rb_option1.setText(model.getoption1());
        rb_option2.setText(model.getoption2());
        rb_option3.setText(model.getoption3());
        rb_option4.setText(model.getoption4());

    }
}



/*    public class QuesHolder extends RecyclerView.ViewHolder {
        public TextView tv_question;
        RadioButton rb_option1, rb_option2, rb_option3, rb_option4;

        public QuesHolder(View itemView) {
            super(itemView);

            tv_question = (TextView) itemView.findViewById(R.id.tv_question);
            rb_option1 = (RadioButton) itemView.findViewById(R.id.rb_option1);
            rb_option2 = (RadioButton) itemView.findViewById(R.id.rb_option2);
            rb_option3 = (RadioButton) itemView.findViewById(R.id.rb_option3);
            rb_option4 = (RadioButton) itemView.findViewById(R.id.rb_option4);
        }
    }

    private class QuesAdapter extends RecyclerView.Adapter<QuesHolder> {

        public QuesAdapter(QuesFragment quesFragment, ArrayList<QuesModel> question) {

        }

        @Override
        public QuesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //step7.1
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_ques, parent, false);
            return new QuesHolder(v);
        }

        @Override
        public void onBindViewHolder(QuesHolder holder, int position) {
            //step 7.2
            holder.tv_question.setText(item);
            holder.rb_option1.setText(item.get(position));
            holder.rb_option2.setText(item.get(position));
            holder.rb_option3.setText(item.get(position));
            holder.rb_option4.setText(item.get(position));


        }

        @Override
        public int getItemCount() {
            return question.size();
        }
    }*/


