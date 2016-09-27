package com.apptivitylab.learn.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jamehii on 9/10/2016.
 */
public class AddTaskFragment extends Fragment
{
    static private int REQUEST_CODE = 1;
    Button mAddTaskButton;
    Button mCancelButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_add_task, container, false);

        mAddTaskButton = (Button)rootView.findViewById(R.id.button_add_task);
        mCancelButton = (Button)rootView.findViewById(R.id.button_cancel);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        mAddTaskButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                EditText editTask = (EditText)view.findViewById(R.id.edit_txt_task_desc);
                String taskString = editTask.getText().toString();

                Intent extraData = new Intent( getContext(), AddTaskFragment.class);
                extraData.putExtra("task", taskString);

                getActivity().setResult(AddTaskFragment.REQUEST_CODE, extraData);
                getActivity().finish();
            }
        });
    }
}
