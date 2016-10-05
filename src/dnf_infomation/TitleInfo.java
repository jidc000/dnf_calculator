package dnf_infomation;

import java.util.LinkedList;

import dnf_InterfacesAndExceptions.Equip_part;
import dnf_InterfacesAndExceptions.Item_rarity;
import dnf_calculator.DoubleStatusInfo;
import dnf_calculator.ElementInfo;
import dnf_calculator.StatusInfo;
import dnf_class.Card;
import dnf_class.Title;

public class TitleInfo {
	public static void getInfo(LinkedList<Title> titleList)
	{
		Title temp;
		Card card;
		String path = "image\\Title\\";
		Item_rarity rarity = Item_rarity.RARE;
		
		//물풍선
		temp = new Title("물풍선 던지기(화)", rarity);
		temp.vStat.addStatList("힘", new StatusInfo(44), true);
		temp.vStat.addStatList("지능", new StatusInfo(44), true);
		temp.vStat.addStatList("물크", new DoubleStatusInfo(3));
		temp.vStat.addStatList("마크", new DoubleStatusInfo(3));
		temp.vStat.addStatList("추뎀", new StatusInfo(10));
		
		card = new Card("전용보주", Item_rarity.NONE);
		card.vStat.addStatList("화속", new ElementInfo(6));
		card.addPart(Equip_part.TITLE);
		temp.setCard(card);
		titleList.add(temp);

		card = new Card("전용보주", Item_rarity.NONE);
		card.vStat.addStatList("수속", new ElementInfo(6));
		card.addPart(Equip_part.TITLE);
		temp = (Title) temp.clone();
		temp.setName("물풍선 던지기(수)");
		temp.setIcon(path+temp.getName()+".png");
		temp.setCard(card);
		titleList.add(temp);
		
		card = new Card("전용보주", Item_rarity.NONE);
		card.vStat.addStatList("명속", new ElementInfo(6));
		card.addPart(Equip_part.TITLE);
		temp = (Title) temp.clone();
		temp.setName("물풍선 던지기(명)");
		temp.setIcon(path+temp.getName()+".png");
		temp.setCard(card);
		titleList.add(temp);
		
		card = new Card("전용보주", Item_rarity.NONE);
		card.vStat.addStatList("암속", new ElementInfo(6));
		card.addPart(Equip_part.TITLE);
		temp = (Title) temp.clone();
		temp.setName("물풍선 던지기(암)");
		temp.setIcon(path+temp.getName()+".png");
		temp.setCard(card);
		titleList.add(temp);
		
		
	}
}
