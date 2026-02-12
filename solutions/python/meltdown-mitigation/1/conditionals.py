"""Functions to prevent a nuclear meltdown."""


def is_criticality_balanced(temperature, neutrons_emitted):

    return temperature < 800 and neutrons_emitted > 500 and (temperature * neutrons_emitted) < 500000
    

def reactor_efficiency(voltage, current, theoretical_max_power):
    
    generated_power = voltage * current
    
    efficiency_percentage = (generated_power / theoretical_max_power) * 100
    
    if efficiency_percentage >= 80:
        return 'green'
    elif efficiency_percentage >= 60:
        return 'orange'
    elif efficiency_percentage >= 30:
        return 'red'
    else:
        return 'black'
    

def fail_safe(temperature, neutrons_produced_per_second, threshold):
    
    calc = temperature * neutrons_produced_per_second
    ninety_porcent = (threshold * 90) / 100
    ten_porcent = (threshold * 10) / 100

    if calc < ninety_porcent:
        return 'LOW'
    elif calc < (threshold + ten_porcent):
        return 'NORMAL'
    else:
        return 'DANGER'

