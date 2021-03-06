package johan.santos.realtimedb_demo.ui.usuallyUser

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import johan.santos.realtimedb_demo.R

class userMainFragment : Fragment() {

    companion object {
        fun newInstance() = userMainFragment()
    }

    private lateinit var viewModel: UserMainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_user_main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(UserMainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}