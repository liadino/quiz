
public class Job
	{
		String title;
		double score;
		boolean teamWork;
		boolean attentionSpanTenacity;
		boolean fastWorker;
		boolean responseToLeadership;
		boolean responseToFailure;
		boolean socialSkills;
		boolean numbers;
		boolean engLit;
		boolean hands;

		public Job(String t, double s, boolean w, boolean a, boolean f, boolean l, boolean r, boolean p, boolean n,
				boolean e, boolean h)
			{
				title = t;
				score = s;
				teamWork = w;
				attentionSpanTenacity = a;
				fastWorker = f;
				responseToLeadership = l;
				responseToFailure = r;
				socialSkills = p;
				numbers = n;
				engLit = e;
				hands = h;
			}

		public String getTitle()
			{
				return title;
			}

		public void setTitle(String title)
			{
				this.title = title;
			}

		public double getScore()
			{
				return score;
			}

		public void setScore(double score)
			{
				this.score = score;
			}

		public boolean getTeamWork()
			{
				return teamWork;
			}

		public void setTeamWork(boolean teamWork)
			{
				this.teamWork = teamWork;
			}

		public boolean getAttentionSpanTenacity()
			{
				return attentionSpanTenacity;
			}

		public void setAttentionSpanTenacity(boolean attentionSpanTenacity)
			{
				this.attentionSpanTenacity = attentionSpanTenacity;
			}

		public boolean getFastWorker()
			{
				return fastWorker;
			}

		public void setFastWorker(boolean fastWorker)
			{
				this.fastWorker = fastWorker;
			}

		public boolean getResponseToLeadership()
			{
				return responseToLeadership;
			}

		public void setResponseToLeadership(boolean responseToLeadership)
			{
				this.responseToLeadership = responseToLeadership;
			}

		public boolean getResponseToFailure()
			{
				return responseToFailure;
			}

		public void setResponseToFailure(boolean responseToFailure)
			{
				this.responseToFailure = responseToFailure;
			}

		public boolean getPeopleLover()
			{
				return socialSkills;
			}

		public void setPeopleLover(boolean peopleLover)
			{
				this.socialSkills = peopleLover;
			}

		public boolean getNumbers()
			{
				return numbers;
			}

		public void setNumbers(boolean numbers)
			{
				this.numbers = numbers;
			}

		public boolean getEngLit()
			{
				return engLit;
			}

		public void setEngLit(boolean engLit)
			{
				this.engLit = engLit;
			}
		public boolean getSocialSkills()
			{
				return socialSkills;
			}

		public void setSocialSkills(boolean socialSkills)
			{
				this.socialSkills = socialSkills;
			}

		public boolean getHands()
			{
				return hands;
			}

		public void setHands(boolean hands)
			{
				this.hands = hands;
			}

	}
