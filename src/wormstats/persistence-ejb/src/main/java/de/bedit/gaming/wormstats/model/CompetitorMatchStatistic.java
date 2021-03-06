package de.bedit.gaming.wormstats.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "competitorMatchStatistic")
@NamedQueries({ @NamedQuery(name = "getAllCompetitorMatchStatisticsByCompetitorId", query = "SELECT cms FROM CompetitorMatchStatistic cms WHERE cms.competitor.id = :id") })
public class CompetitorMatchStatistic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5964272358024146533L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "worms", nullable = false)
	private int worms;
	@Column(name = "kills", nullable = false)
	private int kills;
	@Column(name = "selfkills", nullable = false)
	private int selfKills;
	@OneToOne
	private Competitor competitor;
	@Transient
	private boolean plays;

	public boolean isPlays() {
		return plays;
	}

	public void setPlays(boolean plays) {
		this.plays = plays;
	}

	public int getSelfKills() {
		return selfKills;
	}

	public void setSelfKills(int selfKills) {
		this.selfKills = selfKills;
	}

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
