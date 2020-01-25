import time
from rev_ai import apiclient
client = apiclient.RevAiAPIClient("0222B7Uf2430cBYod54bBPaJvYKqclT3i6dyyHumJnL74Mg07lcSQmKslsjV4xeD94SCPCc0eka8xKeGpxStUat5buYMA")
job = client.submit_job_local_file("C:/Users/Anuj Tukade/Documents/Sound recordings/Filler.m4a")
jobs = client.get_list_of_jobs()
time.sleep(45)
transcript_text = client.get_transcript_text(job.id)
print(transcript_text)
