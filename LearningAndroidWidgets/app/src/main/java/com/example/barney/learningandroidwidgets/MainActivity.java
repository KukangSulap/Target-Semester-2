package com.example.barney.learningandroidwidgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        RecyclerView view;
        CustomAdapter adapter;
        int adapterPosition;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            view = findViewById(R.id.recycler1);
            view.setLayoutManager(new LinearLayoutManager(this));
            adapter = new CustomAdapter();
            view.setAdapter(adapter);

        }

    public int getAdapterPosition() {
        return adapterPosition;
    }


    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
                @Override
                public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
                    return new MyViewHolder(v);
                }


                @Override
                public void onBindViewHolder(final MyViewHolder holder, final int position) {
                    holder.nmWebsite.setText(any[position]);
                    holder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this, detail.class);
                            intent.putExtra("any", any[position]);
                            intent.putExtra("deskripsi", deskripsi[position]);
                            intent.putExtra("code", code[position]);
                            startActivity(intent);
                        }
                    });
                }

                @Override
                public int getItemCount() {
                    return any.length;
                }

                public class
                MyViewHolder extends RecyclerView.ViewHolder {
                    TextView nmWebsite;

                    public MyViewHolder(View itemView) {
                        super(itemView);
                        nmWebsite = itemView.findViewById(R.id.Web);
                    }
                }

                String[] any = {"Text View", "Edit Text", "Button", "Radio Button", "List View", "Grid View", "Web View", "Spinner"};
                String[] deskripsi = {"A user interface element that displays text to the user. To provide user-editable text, see EditText.\n" +
                        "\n" +
                        "The following code sample shows a typical use, with an XML layout and code to modify the contents of the text view:",
                        "A user interface element for entering and modifying text. When you define an edit text widget, you must specify the TextView_inputType attribute. For example, for plain text input set inputType to text :",
                        "A user interface element the user can tap or click to perform an action.\n" +
                                "\n" +
                                "To display a button in an activity, add a button to the activity's layout XML file:",
                        "A radio button is a two-states button that can be either checked or unchecked. When the radio button is unchecked, the user can press or click it to check it. However, contrary to a CheckBox, a radio button cannot be unchecked by the user once checked.\n" +
                                "Radio buttons are normally used together in a RadioGroup. When several radio buttons live inside a radio group, checking one radio button unchecks all the others.\n" +
                                "\n" +
                                "For example, here are a couple RadioButton objects:",
                        "Displays a vertically-scrollable collection of views, where each view is positioned immediatelybelow the previous view in the list. For a more modern, flexible, and performant approach to displaying lists, use RecyclerView.\n" +
                                "\n" +
                                "To display a list, you can include a list view in your layout XML file:\n" +
                                "\n",
                        "GridView is a ViewGroup that displays items in a two-dimensional, scrollable grid. The grid items are automatically inserted to the layout using a ListAdapter. insert the following:",
                        "a WebView provides no browser-like widgets, does not enable JavaScript and web page errors are ignored. If your goal is only to display some HTML as a part of your UI, this is probably fine; the user won't need to interact with the web page beyond reading it, and the web page won't need to interact with the user. If you actually want a full-blown web browser, then you probably want to invoke the Browser application with a URL Intent rather than show it with a WebView. For example:",
                                "In this document\n" +
                                "Populate the Spinner with User Choices\n" +
                                "Responding to User Selections\n" +
                                "Key classes\n" +
                                "Spinner\n" +
                                "SpinnerAdapter\n" +
                                "AdapterView.OnItemSelectedListener\n" +
                                "Spinners provide a quick way to select one value from a set. In the default state, a spinner shows its currently selected value. Touching the spinner displays a dropdown menu with all other available values, from which the user can select a new one. You can add a spinner to your layout with the Spinner object. You should usually do so in your XML layout with a <Spinner> element. For example:"};
                String[] code = {"<TextView\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\" \n" +
                        "        android:text=\"TextView\"/>",
                        "<EditText\n" +
                                "        android:layout_width=\"match_parent\"\n" +
                                "        android:layout_height=\"wrap_content\" \n" +
                                "        android:text=\"EditText\"/>",
                        "<Button\n" +
                                "        android:layout_width=\"match_parent\"\n" +
                                "        android:layout_height=\"wrap_content\" \n" +
                                "        android:text=\"Button\"/>",
                        "<RadioGroup xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                "    android:layout_width=\"fill_parent\"\n" +
                                "    android:layout_height=\"wrap_content\"\n" +
                                "    android:orientation=\"vertical\">\n" +
                                "    <RadioButton android:id=\"@+id/radio_pirates\"\n" +
                                "        android:layout_width=\"wrap_content\"\n" +
                                "        android:layout_height=\"wrap_content\"\n" +
                                "        android:text=\"@string/pirates\"\n" +
                                "        android:onClick=\"onRadioButtonClicked\"/>\n" +
                                "    <RadioButton android:id=\"@+id/radio_ninjas\"\n" +
                                "        android:layout_width=\"wrap_content\"\n" +
                                "        android:layout_height=\"wrap_content\"\n" +
                                "        android:text=\"@string/ninjas\"\n" +
                                "        android:onClick=\"onRadioButtonClicked\"/>\n" +
                                "</RadioGroup>",
                        "<ListView\n" +
                                "      android:id=\"@+id/list_view\"\n" +
                                "      android:layout_width=\"match_parent\"\n" +
                                "      android:layout_height=\"match_parent\" />",
                        "<GridView xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                "    android:id=\"@+id/gridview\"\n" +
                                "    android:layout_width=\"match_parent\"\n" +
                                "    android:layout_height=\"match_parent\"\n" +
                                "    android:columnWidth=\"90dp\"\n" +
                                "    android:numColumns=\"auto_fit\"\n" +
                                "    android:verticalSpacing=\"10dp\"\n" +
                                "    android:horizontalSpacing=\"10dp\"\n" +
                                "    android:stretchMode=\"columnWidth\"\n" +
                                "    android:gravity=\"center\"\n" +
                                "/> ",
                        "<WebView  xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                "   android:id=\"@+id/webview\"\n" +
                                "   android:layout_width=\"fill_parent\"\n" +
                                "   android:layout_height=\"fill_parent\"\n" +
                                "/>\n",
                        "<Spinner\n" +
                                "    android:id=\"@+id/planets_spinner\"\n" +
                                "    android:layout_width=\"fill_parent\"\n" +
                                "    android:layout_height=\"wrap_content\" />" +
                                "" +
                                "And" +
                                "" +
                                "<resources>\n" +
                                "    <string-array name=\"planets_array\">\n" +
                                "        <item>Mercury</item>\n" +
                                "        <item>Venus</item>\n" +
                                "        <item>Earth</item>\n" +
                                "        <item>Mars</item>\n" +
                                "        <item>Jupiter</item>\n" +
                                "        <item>Saturn</item>\n" +
                                "        <item>Uranus</item>\n" +
                                "        <item>Neptune</item>\n" +
                                "    </string-array>\n" +
                                "</resources>" +
                                "" +
                                "With Array Adapter" +
                                "" +
                                "Spinner spinner = (Spinner) findViewById(R.id.spinner);\n" +
                                "// Create an ArrayAdapter using the string array and a default spinner layout\n" +
                                "ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,\n" +
                                "        R.array.planets_array, android.R.layout.simple_spinner_item);\n" +
                                "// Specify the layout to use when the list of choices appears\n" +
                                "adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);\n" +
                                "// Apply the adapter to the spinner\n" +
                                "spinner.setAdapter(adapter)"};
            }

}
