//Put these member variable and methods in the Activity, before "onCreate"

private static MainActivity mainActivity;
    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
    
    //Put this in the onCreate
     setMainActivity(this);
