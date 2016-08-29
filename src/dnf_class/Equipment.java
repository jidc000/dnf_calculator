package dnf_class;

import dnf_InterfacesAndExceptions.AddOn;
import dnf_InterfacesAndExceptions.Dimension_stat;
import dnf_InterfacesAndExceptions.Equip_part;
import dnf_InterfacesAndExceptions.Equip_type;
import dnf_InterfacesAndExceptions.Item_rarity;
import dnf_InterfacesAndExceptions.SetName;

@SuppressWarnings("serial")
public class Equipment extends Item
{
	public Equip_part part;									//부위
	public Dimension_stat dimStat;							//차원작
	public int reinforce;									//강화수치
	public Card card;										//보주
	public SetName setName;									//셋옵이름
	public Equip_type type;									//재질
	
	public Equipment(String name, String icon,Item_rarity rarity, Equip_part part, Dimension_stat dimStat,
			int reinforce, Card card, SetName setName, Equip_type type)
	{	
		super(name, icon, rarity);
		this.part=part;
		this.dimStat=dimStat;
		this.reinforce=reinforce;
		this.card=card;
		this.setName=setName;
		this.type=type;
	}
	public Equipment(String name, String icon, Item_rarity rarity, Equip_part part, Equip_type type)
	{
		this(name, icon, rarity, part, Dimension_stat.NONE, 0, new Card("없음", null, Item_rarity.NONE, AddOn.NONE), SetName.NONE, type);
	}
	public Equipment(String name, String icon, Item_rarity rarity, Equip_part part, Equip_type type, SetName setName)
	{
		this(name, icon, rarity, part, Dimension_stat.NONE, 0, new Card("없음", null, Item_rarity.NONE, AddOn.NONE), setName, type);
	}
	public Equipment(Equip_part part) {
		super();
		this.part=part;
		type = Equip_type.NONE;
		setName=SetName.NONE;
		card = new Card("없음", null, Item_rarity.NONE, AddOn.NONE);
		reinforce=0;
		dimStat=Dimension_stat.NONE;
	}
	
	@Override
	public String toString()
	{
		String out;
		out = "name : " + super.getName() +"\nrarity : "+super.getRarity()+"\nreinforce : "+reinforce+"\ntype : "+type.toString();
		out += "\npart : "+part.toString()+"\ntype : "+type.toString()+"\n\n";
		return out;
	}
	
	@Override
	public String getTypeName() { return part.getName();}
	@Override
	public String getTypeName2()
	{
		if(type.getName().equals("없음")) return null;
		else return type.getName();
	}
}
