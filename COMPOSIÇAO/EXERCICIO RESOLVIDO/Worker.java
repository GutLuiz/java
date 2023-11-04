package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Work {
		private String name;
		private WorkLevel level;
		private Double baseSalary;
		
		private Departamento departamento;
		private List<HoraContrato> contracts = new ArrayList<>();
		
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

		public List<HoraContrato> getContracts() {
			return contracts;
		}

		public void addContract(HoraContrato contract) {
			contracts.add(contract);
		}
		public void removeContract(HoraContrato contract) {
			contracts.remove(contract);
		}
		public double income(Integer year,Integer month) {
			double soma = baseSalary;
			Calendar cal = Calendar.getInstance();
			for(HoraContrato c : contracts) {
				cal.setTime(c.getDate());
				int c_year = cal.get(Calendar.YEAR);
				int c_month = 1 + cal.get(Calendar.MONTH);		
				if(year == c_year && month == c_month ) {
					soma += c.totalValue();
				}	
			}
			return soma;
		}
}

