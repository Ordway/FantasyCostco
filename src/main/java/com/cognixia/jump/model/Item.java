package com.cognixia.jump.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	public static enum Rarity {
		common, uncommon, rare, veryrare, legendary, artifact;
		}
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column(unique = true, nullable = false)
		private String name;
		
		@Column(nullable = false)
		private String type;
		
		@Column(nullable = false)
		private String desc;
		
		@Enumerated(EnumType.STRING)
		@Column(nullable = false)
		private Rarity rarity;
		
		public Item() {
			this(null, "N/A", "N/A", "N/A", Rarity.uncommon);
		}
		
		public Item(Integer id, String name, String type, String desc, Rarity rarity) {
			super();
			this.id = id;
			this.name = name;
			this.type = type;
			this.desc = desc;
			this.rarity = rarity;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Rarity getRarity() {
			return rarity;
		}

		public void setRarity(Rarity rarity) {
			this.rarity = rarity;
		}
		
}
