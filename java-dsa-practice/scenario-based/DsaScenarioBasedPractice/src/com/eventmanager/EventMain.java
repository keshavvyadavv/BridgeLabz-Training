package com.eventmanager;

public class EventMain {
	//get all the tickets
	public static Ticket [] getTickets() {

		Ticket [] tickets = {
				new Ticket(5000, "EventPass_Alpha_001"),
				new Ticket(6515, "EventPass_Beta_002"),
				new Ticket(8030, "EventPass_Gamma_003"),
				new Ticket(9545, "EventPass_Delta_004"),
				new Ticket(11060, "EventPass_Epsilon_005"),
				new Ticket(12575, "EventPass_Zeta_006"),
				new Ticket(14090, "EventPass_Eta_007"),
				new Ticket(15605, "EventPass_Theta_008"),
				new Ticket(17120, "EventPass_Iota_009"),
				new Ticket(18635, "EventPass_Kappa_010"),
				new Ticket(20150, "EventPass_Lambda_011"),
				new Ticket(21665, "EventPass_Mu_012"),
				new Ticket(23180, "EventPass_Nu_013"),
				new Ticket(24695, "EventPass_Xi_014"),
				new Ticket(26210, "EventPass_Omicron_015"),
				new Ticket(27725, "EventPass_Pi_016"),
				new Ticket(29240, "EventPass_Rho_017"),
				new Ticket(30755, "EventPass_Sigma_018"),
				new Ticket(32270, "EventPass_Tau_019"),
				new Ticket(33785, "EventPass_Upsilon_020"),
				new Ticket(35300, "EventPass_Phi_021"),
				new Ticket(36815, "EventPass_Chi_022"),
				new Ticket(38330, "EventPass_Psi_023"),
				new Ticket(39845, "EventPass_Omega_024"),
				new Ticket(41360, "EventPass_Alpha_025"),
				new Ticket(42875, "EventPass_Beta_026"),
				new Ticket(44390, "EventPass_Gamma_027"),
				new Ticket(45905, "EventPass_Delta_028"),
				new Ticket(47420, "EventPass_Epsilon_029"),
				new Ticket(48935, "EventPass_Zeta_030"),
				new Ticket(50450, "EventPass_Eta_031"),
				new Ticket(51965, "EventPass_Theta_032"),
				new Ticket(53480, "EventPass_Iota_033"),
				new Ticket(54995, "EventPass_Kappa_034"),
				new Ticket(56510, "EventPass_Lambda_035"),
				new Ticket(58025, "EventPass_Mu_036"),
				new Ticket(59540, "EventPass_Nu_037"),
				new Ticket(61055, "EventPass_Xi_038"),
				new Ticket(62570, "EventPass_Omicron_039"),
				new Ticket(64085, "EventPass_Pi_040"),
				new Ticket(65600, "EventPass_Rho_041"),
				new Ticket(67115, "EventPass_Sigma_042"),
				new Ticket(68630, "EventPass_Tau_043"),
				new Ticket(70145, "EventPass_Upsilon_044"),
				new Ticket(71660, "EventPass_Phi_045"),
				new Ticket(73175, "EventPass_Chi_046"),
				new Ticket(74690, "EventPass_Psi_047"),
				new Ticket(76205, "EventPass_Omega_048"),
				new Ticket(77720, "EventPass_Alpha_049"),
				new Ticket(79235, "EventPass_Beta_050"),
				new Ticket(80750, "EventPass_Gamma_051"),
				new Ticket(82265, "EventPass_Delta_052"),
				new Ticket(83780, "EventPass_Epsilon_053"),
				new Ticket(85295, "EventPass_Zeta_054"),
				new Ticket(86810, "EventPass_Eta_055"),
				new Ticket(88325, "EventPass_Theta_056"),
				new Ticket(89840, "EventPass_Iota_057"),
				new Ticket(91355, "EventPass_Kappa_058"),
				new Ticket(92870, "EventPass_Lambda_059"),
				new Ticket(94385, "EventPass_Mu_060"),
				new Ticket(95900, "EventPass_Nu_061"),
				new Ticket(97415, "EventPass_Xi_062"),
				new Ticket(98930, "EventPass_Omicron_063"),
				new Ticket(100445, "EventPass_Pi_064"),
				new Ticket(101960, "EventPass_Rho_065"),
				new Ticket(103475, "EventPass_Sigma_066"),
				new Ticket(104990, "EventPass_Tau_067"),
				new Ticket(106505, "EventPass_Upsilon_068"),
				new Ticket(108020, "EventPass_Phi_069"),
				new Ticket(109535, "EventPass_Chi_070"),
				new Ticket(111050, "EventPass_Psi_071"),
				new Ticket(112565, "EventPass_Omega_072"),
				new Ticket(114080, "EventPass_Alpha_073"),
				new Ticket(115595, "EventPass_Beta_074"),
				new Ticket(117110, "EventPass_Gamma_075"),
				new Ticket(118625, "EventPass_Delta_076"),
				new Ticket(120140, "EventPass_Epsilon_077"),
				new Ticket(121655, "EventPass_Zeta_078"),
				new Ticket(123170, "EventPass_Eta_079"),
				new Ticket(124685, "EventPass_Theta_080"),
				new Ticket(126200, "EventPass_Iota_081"),
				new Ticket(127715, "EventPass_Kappa_082"),
				new Ticket(129230, "EventPass_Lambda_083"),
				new Ticket(130745, "EventPass_Mu_084"),
				new Ticket(132260, "EventPass_Nu_085"),
				new Ticket(133775, "EventPass_Xi_086"),
				new Ticket(135290, "EventPass_Omicron_087"),
				new Ticket(136805, "EventPass_Pi_088"),
				new Ticket(138320, "EventPass_Rho_089"),
				new Ticket(139835, "EventPass_Sigma_090"),
				new Ticket(141350, "EventPass_Tau_091"),
				new Ticket(142865, "EventPass_Upsilon_092"),
				new Ticket(144380, "EventPass_Phi_093"),
				new Ticket(145895, "EventPass_Chi_094"),
				new Ticket(147410, "EventPass_Psi_095"),
				new Ticket(148925, "EventPass_Omega_096"),
				new Ticket(150440, "EventPass_Alpha_097"),
				new Ticket(151955, "EventPass_Beta_098"),
				new Ticket(153470, "EventPass_Gamma_099"),
				new Ticket(154985, "EventPass_Delta_100")
		};
		return tickets;
	}
	
	// method that get Partition index
	public static int getPartitionIndex(Ticket [] arr , int low , int high) {
		int pivot = high;
		int i = low - 1;
		for(int j = 0 ; j < high ; j++) {
			if(arr[j].getPrice() <= arr[pivot].getPrice()) {
				i++;
				Ticket temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		Ticket temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp; 
		return i + 1;
	}
	//method quicksort
	public static void quickSort(Ticket [] arr , int low , int high) {
		if(low < high) {
			int partitionIndex = getPartitionIndex(arr , low , high);
			quickSort(arr, low , partitionIndex-1);
			quickSort(arr, partitionIndex+1, high);
		}
	}
	
	public static void main(String[] args) {
		//get all tickets 
		Ticket [] tickets = getTickets();
		//sort using quick sort
		quickSort(tickets, 0 , tickets.length-1);
		
		//display it
		for(Ticket ticket : tickets) {
			System.out.println(ticket.toString());
		}
	}
}
