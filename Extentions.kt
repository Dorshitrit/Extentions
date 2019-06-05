fun <T : Any?> MutableLiveData<T>.default(initialValue: T) = apply { setValue(initialValue) }


inline fun <reified T : Fragment> AppCompatActivity.getNavFragment(navHost: Int): T? =
    supportFragmentManager.findFragmentById(navHost)?.let {
        it.childFragmentManager.fragments.find { item -> item is T } as T?
    }
    
    fun Fragment.goBack() = findNavController().navigateUp()

