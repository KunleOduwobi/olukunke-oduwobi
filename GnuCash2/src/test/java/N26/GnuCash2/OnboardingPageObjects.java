package N26.GnuCash2;

public class OnboardingPageObjects {

	public OnboardingPageObjects() {
		// TODO Auto-generated constructor stub
	}
	// APP SESSION
		private boolean appSession;

		public boolean getAppSession() {
			return appSession;
		}

		public void setAppSession(boolean appSession) {
			this.appSession = appSession;
		}


	private String WelcomeId = "android:id/title";
	private String NextBtnId = "org.gnucash.android:id/btn_save";
	private String CurrencyIds = "android:id/text1";
	private String CurrencyClass = "android.widget.CheckedTextView";
	private String BackBtnId = "org.gnucash.android:id/btn_cancel";
	private String Text2Ids = "android:id/text2";
	private String AlertTitleId = "android:id/alertTitle";
	private String AlertMessageId = "android:id/message";
	private String DismissBtnId = "android:id/button1";
	
	public String getWelcomeId() {
		return WelcomeId;
	}

	public String getNextBtnId() {
		return NextBtnId;
	}

	public String getCurrencyIds() {
		return CurrencyIds;
	}

	public String getCurrencyClass() {
		return CurrencyClass;
	}

	public String getBackBtnId() {
		return BackBtnId;
	}

	public String getText2Ids() {
		return Text2Ids;
	}

	public String getAlertTitleId() {
		return AlertTitleId;
	}

	public String getAlertMessageId() {
		return AlertMessageId;
	}

	public String getDismissBtnId() {
		return DismissBtnId;
	}

	
}
