package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;
// COLOCANDO AS INFORMAÇOES DOS CONTRATOS, DA PESSOA, E SUA BASE SALARIAL:
public class Work {
		private String name;
		private WorkLevel level; //PEGOU INFORMAÇOES DA CLASSE QUE TINHA ENUMS(WorkerLevel)
		private Double baseSalary;
		private Departamento departamento; // PEGOU INFORMAÇOES DA CLASSE "DEPARTAMENTO"
		private List<HoraContrato> contracts = new ArrayList<>(); // COMO NO EXEMPLO SAO VARIOS CONTRATOS, DEPEDENDO DO USUARIO A QUANTIDADE, INSTACIAMOS UMA LISTA PARA CLASSE "HoraContrato"
		
		//APLICANDO OS CONSTRUTORES, GETS E SETS DE CADA PRIVATE(MENOS CONTRATO): 
		public Work() {
			
		}

		public Work(String name, WorkLevel level, Double baseSalary, Departamento departamento) {
			this.name = name;
			this.level = level;
			this.baseSalary = baseSalary;
			this.departamento = departamento;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public WorkLevel getLevel() {
			return level;
		}

		public void setLevel(WorkLevel level) {
			this.level = level;
		}

		public Double getBaseSalary() {
			return baseSalary;
		}

		public void setBaseSalary(Double baseSalary) {
			this.baseSalary = baseSalary;
		}

		public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}
		
		//COMO TEMOS QUE ADICIONAR E REMOVER CONTRATOS DURANTE A COMPILAÇAO, TEMOS QUE REMOVER O SETCONTRATO, E COLOCARMOS MANUALMENTE AS OPERAÇOES:
		public List<HoraContrato> getContracts() {
			return contracts;
		}
		//ADICIONANDO E REMOVENDO CONTRATOS:
		public void addContract(HoraContrato contract) {
			contracts.add(contract);
		}
		public void removeContract(HoraContrato contract) {
			contracts.remove(contract);
		}
		
		//acrescentando a soma dos contratos pedidos na data especifica mais a base salarial:
		public double income(Integer year,Integer month) {
			double soma = baseSalary;
			Calendar cal = Calendar.getInstance();//usando calendario 
			for(HoraContrato c : contracts) {
				cal.setTime(c.getDate());// pegando a data do contrato definindo a data do calendario
				int c_year = cal.get(Calendar.YEAR); //representa o ano do contrato
				int c_month = 1 + cal.get(Calendar.MONTH);//representa o mes do contrato + 1 pq o mes começa com 0		
				if(year == c_year && month == c_month ) {//incluindo uma codinçao pois n sao todos os contratos
					soma += c.totalValue();
				}	
			}
			return soma;
		}
}

