package com.cashcow.rajesh.cashcow;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class ManuFragment extends Fragment {
	
	Fragment frag;
	FragmentTransaction fragtransaction;
	public ManuFragment() {
			}
	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater,
							 @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
				View view=inflater.inflate(R.layout.manu_fragment, container ,false);

		frag=new HomeFragment();
		fragtransaction=getFragmentManager().beginTransaction().add(R.id.container, frag);
		fragtransaction.commit();
								return  view;
			}

}
