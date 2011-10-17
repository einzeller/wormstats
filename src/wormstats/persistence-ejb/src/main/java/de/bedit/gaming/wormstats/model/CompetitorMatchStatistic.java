package de.bedit.gaming.wormstats.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Embeddable
@Table(name = "competitorMatchStatistic")
public class CompetitorMatchStatistic implements Serializable {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "worms")
	private int worms;

	@Column(name = "kills")
	private int kills;

	@Column(name = "competitor")
	@OneToOne(mappedBy = "competitorMatchStatistic")
	private Competitor competitor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getWorms() {
		return worms;
	}

	public void setWorms(int worms) {
		this.worms = worms;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public Competitor getCompetitor() {
		return competitor;
	}

	public void setCompetitor(Competitor competitor) {
		this.competitor = competitor;
	}

}
