terraform {
  required_providers {
    google = {
      source  = "hashicorp/google"
      version = "~> 7.0"
    }
  }
}

variable "project_id" {
  description = "GCP project ID"
  type        = string
}

provider "google" {
  project = var.project_id
  region  = "asia-south1"
}

resource "google_compute_network" "practice_vpc" {
  name                    = "ghs-terraform-practice-vpc"
  auto_create_subnetworks = false
}

resource "google_compute_subnetwork" "practice_subnet" {
  name          = "ghs-practice-subnet"
  project       = var.project_id
  region        = "asia-south1"
  network       = google_compute_network.practice_vpc.id
  ip_cidr_range = "10.20.0.0/20"
}
